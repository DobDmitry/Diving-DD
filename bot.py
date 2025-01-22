from aiogram import Bot, Dispatcher, types
from aiogram.filters import Command
from aiogram.types import Message
import asyncio
import logging

# Включите логирование
logging.basicConfig(level=logging.INFO)

# Инициализация бота
bot = Bot(token="7776554480:AAFKtNtCW7YpgLW_SuV2xf5INeURxqfUu6c")
dp = Dispatcher()

# Словарь с коэффициентами прыжков
dive_coefficients = {
    "101": {  # Номер прыжка
        "A": {"1": 1.4, "3": 1.6},  # Положение A, высоты 1 и 3 метра
        "B": {"1": 1.3, "3": 1.5},  # Положение B, высоты 1 и 3 метра
        "C": {"1": 1.2, "3": 1.4},  # Положение C, высоты 1 и 3 метра
        "D": {"1": None, "3": None}  # Положение D, высоты 1 и 3 метра
    },
    "102": {
        "A": {"1": 1.6, "3": 1.7},
        "B": {"1": 1.5, "3": 1.6},
        "C": {"1": 1.4, "3": 1.5},
        "D": {"1": None, "3": None}
    },
        "103": {
        "A": {"1": 2.0, "3": 1.9},
        "B": {"1": 1.7, "3": 1.6},
        "C": {"1": 1.6, "3": 1.5},
        "D": {"1": None, "3": None}
    },
    "201": {
        "A": {"1": 1.7, "3": 1.9},
        "B": {"1": 1.6, "3": 1.8},
        "C": {"1": 1.5, "3": 1.7},
        "D": {"1": None, "3": None}
    },
    # Добавьте другие прыжки по аналогии
}

# Поиск коэффициента по запросу
def find_coefficient(jump_number, position, height):
    try:
        # Проверяем, существует ли прыжок
        if jump_number not in dive_coefficients:
            return "Прыжок не найден."
        
        # Проверяем, существует ли положение
        if position.upper() not in dive_coefficients[jump_number]:
            return "Некорректное положение."
        
        # Получаем коэффициент
        coefficient = dive_coefficients[jump_number][position.upper()][height]
        
        if coefficient is None:
            return "Коэффициент для данного прыжка и положения не найден."
        
        return f"Коэффициент для прыжка {jump_number}{position} ({height} м): {coefficient}"
    except Exception as e:
        return f"Произошла ошибка: {e}"

# Обработчик команды /start
@dp.message(Command("start"))
async def start(message: types.Message):
    await message.answer(
        "Привет! Я бот для поиска коэффициентов прыжков в воду. "
        "Отправь мне запрос в формате [номер прыжка][положение][высота], например: 101A3"
    )

# Обработчик текстовых сообщений
@dp.message()
async def handle_message(message: types.Message):
    text = message.text.strip()
    
    # Проверяем формат запроса
    if len(text) < 3:
        await message.answer("Некорректный формат запроса. Пример: 101A3")
        return
    
    try:
        jump_number = text[:-2]
        position = text[-2].upper()
        height = text[-1]
        
        if height not in ["1", "3"]:
            await message.answer("Некорректная высота. Используйте 1 или 3.")
            return
        
        result = find_coefficient(jump_number, position, height)
        await message.answer(result)
    except Exception as e:
        await message.answer(f"Произошла ошибка: {e}")

# Запуск бота
async def main():
    await bot.delete_webhook(drop_pending_updates=True)  # Пропустить накопившиеся обновления
    await dp.start_polling(bot)

if __name__ == "__main__":
    asyncio.run(main())
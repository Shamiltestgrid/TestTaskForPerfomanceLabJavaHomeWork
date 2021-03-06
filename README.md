# Домашнее задание по вводному занятию Java.

Форма сдачи: предпочтительно ссылка на github (можно сделать приватный репозиторий, доступный по ссылке); в особых случаях готов принять в виде zip-архива со снижением максимального балла.

Примеры запуска указаны для запуска скомпилированного приложения, не упакованного в исполняемых jar-архив. 

Обратите внимание, что для передачи аргументов при запуске приложения из IDEA вы можете редактировать конфигурацию запуска приложения: 



1. Напишите приложение Multiplication, которое после запуска выводит на экран таблицу умножения чисел до 10 и завершает работу. Числа разделить пробелом. (Вариант “со звёздочкой”: выровняйте их нужным количеством пробелов).

Пример:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100

2. Напишите приложение EchoChamber, которое после запуска считывает строки, вводимые пользователем в консоль (для этого можно использовать, например, java.util.Scanner), и сохраняет их в коллекции (какой-нибудь реализации java.util.List), пока пользователь не введёт пустую строку.
После ввода пользователем пустой строки, вывести все строки, которые пользователь ввёл до этого, в том же порядке, и закончить работу приложения.

Пример: 
Пользователь вводит: 	Привет<Enter>
				Пока<Enter>
				<Enter>
Приложение выводит:	Привет
				Пока

3. Скопируйте проект из задания 2 в новую папку, переименуйте в IOChamber. Добавьте возможность вместо считывания пользовательского ввода из консоли, считать содержимое текстового файла, вывести его содержимое в консоль, закончить работу приложения.
Выбор осуществляется следующим образом: если при запуске приложения ему передан аргумент – путь к текстовому файлу, то приложение выводит его содержимое (для работы с файлом можно использовать, например, java.io.FileReader, а также рекомендую обратить внимание на java.nio.Files для получения BufferedReader, у которого есть очень хороший метод lines(), преимущества которого мы обсудим на следующем занятии).
Если при запуске передан аргумент, но он не является валидным идентификатором файла или такого файла не существует, должно быть выведено сообщение “Файл не распознан. Введите ваши сообщения”, после чего приложение должно работать, как в задании 2.
Если при запуске не передается аргумент, приложение должно работать, как в задании 2.

Пример:
Запуск с аргументом:	java IOChamber “C:\Users\admin\Documents\text.txt”
* Приложение выводит содержимое текстового файла в консоль и завершает работу *
Запуск без аргумента:	java IOChamber
* Как в задании 2 *

4. В том же проекте, в котором вы выполнили задание 3, внесите изменения таким образом, чтобы выводить только нечётные строки (как для файла, так и для пользовательского ввода).

Пример: 
Запуск без аргумента:	 java IOChamber
Пользователь вводит: 	Привет<Enter>
				Как<Enter>
				Тебя<Enter>
				Зовут<Enter>
				Спасибо<Enter>
				Пожалуйста<Enter>
				<Enter>
Приложение выводит:	Привет
				Тебя
				Спасибо


eWork

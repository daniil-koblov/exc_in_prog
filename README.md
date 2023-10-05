# "Исключения в программировании".

В репозитории храниится работа по курсу. Он разделен на папки с работой на лекциях (если есть практика), семинарах и с практическими заданиями.

## Лекции

## Семинары

### 1 Задание.

Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

### 2 Задание.

Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
* если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки,
* если искомый элемент не найден, метод вернет -2 в качестве кода ошибки,
* если вместо массива пришел null, метод вернет -3.

Придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

### 3 Задание.

Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

## Практические задания

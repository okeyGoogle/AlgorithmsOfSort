# AlgorithmsOfSort
</br>
=====Сложность алгоритмов======</br></br>
**O(n) Линейная** 
</br>
Допустим, нужно посчитать количество символов в строке</br>
(1, 2, 3...)</br>
при таком подсчете скорость алгоритма буде ровна O(n) *(говорится  "о большая от н")*, с увеличением входных данных возрастает сложность алгоритма т.е. линейно.</br></br> 
**O(1) Константная** 
</br>
Не зависит от количества входных данных, скорость будет постоянна.
Пример: </br>
Имеется переменная String s = “Hello!”; </br>
Заведомо зная длину строки “6”, создадим переменную хранящую значение длинны строки S и сразу запишем в неё значение int stringLenght = 6; таким образом нам ненужно постоянно считать и перебирать все символы строки, просто нужно обращаться к значению переменой длины строки, и каждый раз мы будем тратить одно и тоже время, вне зависимости количества поступающих данных.</br></br>
**O(logn) Логарифмическая**
</br>
Алгоритм деления пополам  </br></br>
=====Сортировка выбором (Selection sort) сложность O(n2) ====== </br>
В массиве чисел сначала находится минимальное не отсортированное значение, во время итераций программа берёт значение и сравнивает его по очерёдности с каждым, если выбранное значение меньше всех остальных, то оно перемещается в отсортированный массив. </br></br>
=====Сортировка пузырьком (bubble sort ) сложность O(n2) ====== </br>
При проходе по массиву проверяются два соседних элемента, и если они в неправильном порядке то они меняются местами. Выполняются процедуры до тех пор, пока не отсортируется весь массив. </br> *Происходит эффект пузыря, наибольшее значение выдавливается в конец.*</br></br> 

===== Алгоритм Евклида (Euclidean Algorithm) ====== </br>
Нахождение наибольшего общего делителя (НОД) двух чисел, на которое эти числа делятся без остатка.</br>

package by.htp.hometask.saiko._1dArrays;

import java.util.Random;

public class Tasks {

	public static void main(String[] args) {
		
		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
	}

	
	public static void task01() {
		
		// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
		
		int k = 3;
		int n = 100;
		int sum = 0;
		int[] mas = new int[n];
		
		for(int i = 0; i < n; i++) {
			mas[i] = i + 1;
			if(mas[i] % k == 0) {
				sum = sum + mas[i];
			}
		}
		System.out.println(sum);
	}
	
	
	public static void task02() {
		
		//  В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
		
		int[] mas = {1, 2, 0, 4, 5, 0, 0, 6, 3};
		int count = 0;
		int j = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count = count + 1;
			}
		}
		
		int[] index = new int [count];
    
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				index[j] = i;
				j++;
			}
		}
    
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + " ");
		}
		System.out.println();
	}
		
	
		public static void task03() {
			
			// Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или отрицательное.
			
			int[] mas = new int[] {1, 2, 3, 4, 5, 7, 9};
			
			for(int i = 0; i < mas.length; i++) {
				if(mas[i] < 0) {
					System.out.println("Раньше встречается отрицательное число");
					break;
				} else if (mas[i] > 0) {
					System.out.println("Раньше встречается положительное число");
					break;
				}
			}
		}
	
		
		public static void task04() {
			
			// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
			
			int[] mas = {1, 0, -1, -2, -3, -4, -5, -6, -7};
			
			for(int i = 0; i < mas.length; i++) {
				if(mas[i] < mas[i + 1]) {
					System.out.println("Последовательность является возрастающей");
					break;
				} else {
					System.out.println("Последовательность является убывающей");
					break;
				}
			}
		}
		
		
		public static void task05() {
			
			// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.

			int k = 0;
			int[] mas = new int[] { 0, 6, 7, 8, 0, 10, 9, 5, 12 };
			for (int i = 0; i < mas.length; i++) {									// Кол-во четных элементов
				if ((mas[i] != 0) && (mas[i] % 2 == 0)) {
					k++;
				}
			}
			
			if(k > 0) {
			
			int[] mas_new = new int[k];
			int i = 0;
			for (int j = 0; j < mas.length; j++) {
				if ((mas[j] != 0) && (mas[j] % 2 == 0)) {							// Новый массив
					mas_new[i] = mas[j];
					i++;
				}
			}
		
			for (i = 0; i < mas_new.length; i++) {
				System.out.print(mas_new[i] + " ");
			} 
			System.out.println();
			}else {
				System.out.println("Нет четных чисел в массиве");
			}
		}
		
		
		public static void task06() {
			
			// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
			
			int [] arr = {8, 5, 7, 6, 8, 5, 5, 13};
	        int max = 0;
	        int min = arr[0];

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            } else if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        System.out.println("Наименьшая длина числовой оси равна: " + (max - min));
		}
		
		
		public static void task07() {
			
			// Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

			int[] arr = {1, 2, 4, 5, 6, 8, 9, 10};
			int z = 2;
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] > z) {
					arr[i] = z;
					count++;
				}
			}
			System.out.println("Количество замен: " + count);
		}
		
		
		public static void task08() {
			
			// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
		
			double[] mas = new double[] {-1.4, -2.1, 0, 0, 0, 0, 3.2, 4.9, -5.6, -4.0, 0, 3.2, 4.9, 5.5};
			
			int plus = 0;
			int minus = 0;
			int zero = 0;

			for (int i = 0; i < mas.length; i++) {
				if (mas[i] > 0) {
					plus++;
				} else if (mas[i] < 0) {
					minus++;
				} else {
					zero++;
				}
			}
			System.out.println("Положительных элементов: " + plus);
			System.out.println("Отрицательных элементов: " + minus);
			System.out.println("Нулевых элементов: " + zero);
		}
		
		
		public static void task09() {
			
			// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
			
			int[] array = new int[10];
			
		    int min = 0;
		    int max = 0;

		    for (int i = 0; i < array.length; i++) {
		    	array[i] = i + 1;
		      if (array[i] < array[min]) {
		        min = i;
		      }
		      else if (array[i] > array[max]) {
		        max = i;
		      }
		    }
		    
		    System.out.println("Наименьший эллемент массива: " + array[min]);
		    System.out.println("Наибольший эллемент массива: " + array[max]);

		    int b = array[min];
		    array[min] = array[max];
		    array[max] = b;

		    for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		    }
		}
		
		
		public static void task10() {
			
			// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
			
			System.out.println("Даны целые числа: ");
			int[] mas = new int[15];
			for (int i = 0; i < mas.length; i++) {
				mas[i] = i + 1;
				System.out.print(mas[i] + " ");
			}

			System.out.println("\nВыводим те числа, для которых а[i] > i:");
			for (int i = 5; i < mas.length; i++) {
				if (mas[i] > i) {
					System.out.print(mas[i] + " ");
				}
			}
		}
		
		
		public static void task11() {
			
			// Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1)
			
			int [] arr = new int[20];
	        int m = 5;
	        int l = 2;
	        int ost;

	        for(int i = 0; i < arr.length; ++i) {
	            arr[i] = i + 1;
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println("\nОстаток от деления на " + m + " равен " + l + " у чисел:");

	        for(int i = 0; i < arr.length; i++) {
	            ost = arr[i] % m;
	            if (ost == l && l > 0 && l < m - 1) {
	                System.out.print(arr[i] + " ");
	            }
	        }	
		}
		
		
		public static void task12() {
			
			// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

			
			double[] mas = new double[] {5, 58, 2.5, 24, 34.4, -5, 24.5};

			double sum = 0;

			for (int i = 2; i < mas.length; i++) {
				if ((i == 2) || (i % 2 != 0)) {
					sum = sum + mas[i];

					System.out.print(mas[i] + "  ");
				}
			}

			System.out.println();
			System.out.println("Сумма порядковых номеров этих чисел из массива равна: " + sum);
		}
		
		
		public static void task13() {
			
			// Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в промежутке от L до N.
			
			int n = 20;
			int l = 6;
			int m = 4;
			
			int mas[] = new int[n];
			for (int i = 0; i < mas.length; i++) {
				mas[i] = i + 1;			
				System.out.print(mas[i] + " ");
			}
			int count = findCountElements(mas, l, m, n);	
			System.out.println();
			System.out.println("Количество элементов последовательности, кратных числу " + m + " и заключенных в промежутке от "  + l + " до " + n + " = " + count);	
		}
		
		public static int findCountElements(int mas[], int l, int m, int n) {
			
			int count = 0;
			for (int i = 0; i < mas.length; i++) {
				if ((mas[i] % m == 0) && ((l - 1) <= i) && (i <= n)) {
					count++;
				}					
			}
			return count;
		}
		
		
		public static void task14() {
			
			// Дан одномерный массив A[N]. Найти: max(a2,a4,...,a2k )+min(a1,a3,...,a2k+1)
			
			int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
			int max = arr[0];
			int min = arr[1];
			
			for (int i = 2; i < arr.length;) {
				arr[i] = i + 1;
				if (arr[i] > max) {
					max = arr[i];
				}
				i = i + 2;
			}
			
			for (int i = 1; i < arr.length;) {
				arr[i] = i + 1;
				if (arr[i] < min) {
					min = arr[i];
				}
				i = i + 2;
			}
			
			int sum = max + min;
			
			System.out.println("Результат: " + sum);
		}
		
		
		public static void task15() {
			
			// Дана последовательность действительных чисел a1,a2,...,an. Указать те ее элементы, которые принадлежат отрезку [с, d].
			
			int c = 7;
			int d = 17;
			double[] arr = new double[15];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i;
				if ((i >= c) && (i <= d)) {
				System.out.print(arr[i] + " ");
				}
			}
		}
		
		
		public static void task16() {
			
			// Даны действительные числа a1,a2,...,an. Найти max(a1 + a2n,a2 + a2n−1,an + an+1).
						
			int[] arr = new int[] {3, 4, 6, 2, 5, 7, 9, 1};
			
			int maxSum;
			maxSum = countMax(arr);
			
			System.out.println("\nРезультат: " + maxSum);
		}
		
		public static int countMax(int[] array) {

			int max;
			max = array[0] + array[1];
			
			for (int i = 1; i < array.length - 1; i++) {
				int sum;
				sum = array[i] + array[i + 1];
				if (sum > max) {
					max = sum;
				}
			}
			return max;
		}
		
		
		public static void task17() {
			
			// Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,...,an).

			int[] arr = {3, 1, 2, 4, 3, 5, 2, 3, 7, 8, 2, 5, 3, 9};
			int min = arr[1];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			
			System.out.println("Новая последовательность: ");
			
			int x = arr.length;
			int[] mas = new int[x];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != min) {
					mas[i] = arr[i];
					System.out.print(mas[i] + " ");
				}
			}
		}
		
		
		public static void task18() {
			
			//  «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек).
			//  Напишите программу, которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.

			int[] mas = new int[10];

			printMas(mas);
			secretCode(mas);
		}

		public static void secretCode(int[] mas) {
			
			for (int i = 0; i < mas.length - 2; i++) {
				if (mas[i] == 10 - (mas[i + 1] + mas[i + 2])) {
					System.out.println();
					System.out.println("Дверь открыта");
					break;
				} else {
					System.out.println();
					System.out.println("Дверь закрыта");
					break;
				}
			}
		}

		public static void printMas(int[] mas) {
			
			System.out.println();
			
			for (int i = 0; i < mas.length; i++) {
				mas[i] = ((int) (Math.random() * 6) + 1);
			
				System.out.print(mas[i] + " ");
			}
		}
		
		
		public static void task19() {
			
			// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.
			
			Random random = new Random();

	        int size = 20;
	        int[] mas = new int[size];
	       
	        System.out.println("Массив:");
	        
	        for (int i = 0; i < size; i++) {
	        	mas[i] = random.nextInt(100) - 50;
	            System.out.print(mas[i] + " ");
	        }

	        int count;
	        int maxCount = 0;
	        int maxIndex = 0;

	        for (int i = 0; i < size; i++) {
	            count = 0;
	            for (int j = 0; j < size; j++) {
	                if (mas[i] == mas[j]) {
	                    count++;
	                }
	            }
	            if (count > maxCount) {
	                maxCount = count;
	                maxIndex = i;
	            } else if (count == maxCount && mas[i] < mas[maxIndex]) {
	                    maxCount = count;
	                    maxIndex = i;  
	            }
	        }
	        System.out.println("\nНаиболее часто встречающееся число: " + mas[maxIndex] + "\nПовторяется " + maxCount + " раз(а)");
		}
		
		
		public static void task20() {
			
			// Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
			
			int[] arr = {15, 1, 2, 5, 7, 23, 5, 6, 11};
			
			for (int i = 1; i < arr.length; i = i + 2) {
				arr[i] = 0;
			}
			
			System.out.println("Массив после сжатия: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
	}

}

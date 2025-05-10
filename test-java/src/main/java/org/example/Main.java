package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Необходимо подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив,
 * где ключ – элемент списка, значение – количество этих элементов в списке. Порядок не имеет значения.
 * <p>
 * Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Long> result = countNumber(array);
        System.out.println(result);
    }

    private static Map<Integer, Long> countNumber(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.toMap(key -> key, value -> 1L, Long::sum));
    }
}
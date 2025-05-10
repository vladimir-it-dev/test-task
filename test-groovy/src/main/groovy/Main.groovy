/**
 * Необходимо подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив,
 * где ключ – элемент списка, значение – количество этих элементов в списке. Порядок не имеет значения.
 * <p>
 * Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
 */
static void main(String[] args) {
  def array = [1, 3, 4, 5, 1, 5, 4]
  def result = countNumbers(array)
  println(result)

}

static def countNumbers(array) {
  array.groupBy { it }.collectEntries { key, values -> [key, values.size()] }
}
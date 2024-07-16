import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers =
                new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePRimeNumbers = new ArrayList<>();
        nextFivePRimeNumbers.add(13);
        nextFivePRimeNumbers.add(17);
        nextFivePRimeNumbers.add(19);
        nextFivePRimeNumbers.add(23);
        nextFivePRimeNumbers.add(29);

        firstFivePrimeNumbers.addAll(nextFivePRimeNumbers);

        System.out.println(firstFivePrimeNumbers);

    }

}

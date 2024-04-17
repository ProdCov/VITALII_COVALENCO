package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    
    CHECK_IF_ODD(x -> x % 2 == 1 || x % 2 == -1),
    CHECK_IF_EVEN(x -> x % 2 == 0 && !(x % 2 == -1)),
    CHECK_IF_NEGATIVE(x -> x < 0),
    CHECK_IF_POSITIVE(x -> x > 0);
    
    public Predicate<Integer> algo;
    
    CheckInteger(Predicate<Integer> algo) {
        this.algo = algo;
    }
}

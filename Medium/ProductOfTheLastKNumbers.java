
/* Design an algorithm that accepts a stream of integers and retrieves the product of the last k integers of the stream.

Implement the ProductOfNumbers class:

    ProductOfNumbers() Initializes the object with an empty stream.
    void add(int num) Appends the integer num to the stream.
    int getProduct(int k) Returns the product of the last k numbers in the current list. You can assume that always the current list has at least k numbers.

The test cases are generated so that, at any time, the product of any contiguous sequence of numbers will fit into a single 32-bit integer without overflowing. */

package Medium;

import java.util.*;

class ProductOfTheLastKNumbers {

    List<Integer> list;
    int prev;

    public ProductOfNumbers() {
        list = new ArrayList();
        List.add(1);
        prev = 1;
    }

    public void add(int num) {
        if (num > 0) {
            prev *= num;
            list.add(prev);
        }
        // if this is 0 we need to reinit the structure
        else {
            list = new ArrayList();
            list.add(1);
            prev = 1;
        }
    }

    public int getProduct(int k) {
        int N = list.size();
        // in case there are not enough elements by the problem definition it can only
        // happen if
        // we have met 0 before. In this case return 0. In all other cases we get the
        // product from
        // division due to prefix product property. Note that list always has n + 1
        // elements due to
        // initial 1, we need it to avoid outofbounds checks for edge cases
        return (k < N) ? prev / list.get(N - 1 - k) : 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
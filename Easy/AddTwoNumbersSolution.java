package Easy;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lista = new ListNode(0);
        ListNode cola = lista;
        int nodo = 0;

        while (l1 != null || l2 != null || nodo != 0) {
            int uno;
            if (l1 != null) {
                uno = l1.val;
            } else {
                uno = 0;
            }
            int dos;
            if (l2 != null) {
                dos = l2.val;
            } else {
                dos = 0;
            }

            int sum = uno + dos + nodo;
            int digit = sum % 10;
            nodo = sum / 10;

            ListNode nuevoNodo = new ListNode(digit);
            cola.next = nuevoNodo;
            cola = cola.next;

            if (l1 != null) {
                l1 = l1.next;
            } else {
                l1 = null;
            }

            if (l2 != null) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
        }

        ListNode resultado = lista.next;
        lista.next = null;
        return resultado;
    }
}
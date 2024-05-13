package question4;

public class BubblSortAlpha {
    char[] alphabets={'a','b','c'};
    //System.out.println(bubblesort(alphabets));
    void bubblesort(char[] bubble) {
        for(int i = bubble.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {

                if(bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

    }}

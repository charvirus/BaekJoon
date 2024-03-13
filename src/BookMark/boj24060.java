package BookMark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj24060 {
    int[] arr;
    static int[] temp;
    static int result = -1;
    static int cnt = 0;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[A];
        temp = new int[A];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, A - 1);

        System.out.println(result);
    }

    static void mergeSort(int[] arr, int h, int t) {
        if (h < t) {
            int q = (h + t) / 2;
            mergeSort(arr, h, q);
            mergeSort(arr, q + 1, t);
            merge(arr,h,q,t);
        }
    }

    static void merge(int[] arr, int h, int m, int t) {
        int i = h;
        int j = m + 1;
        int k = 0;
        while (i <= m && j <= t) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= m) {
            temp[k++] = arr[i++];
        }
        while (j <= t) {
            temp[k++] = arr[j++];
        }

        i = h;
        k = 0;
        while (i <= t) {
            cnt++;
            if(cnt == K){
                result = temp[k];
                break;
            }

            arr[i++] = temp[k++];
        }
    }
}

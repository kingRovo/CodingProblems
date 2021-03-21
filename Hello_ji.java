public class Hello_ji {
public static void main(String[] args) { 
    int i, j, nums[] = { 1,1,4,0,1,1,1,1 };

    for (i = 0; i < nums.length; ++i) {

    int subBeforeHead = 0;
    int sumAfterHead = 0;

    for (j = 0; j < nums.length; ++j){

        if (j == i)continue;

        if (j < i)

            subBeforeHead += nums[j];
        else
            sumAfterHead += nums[j];
    }
    if(subBeforeHead == sumAfterHead) { System.out.println(i + 1);}

    }
}
}
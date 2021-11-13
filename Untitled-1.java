import java.util.Arrays;
import java.util.Random;

public class ArrayReview
{
private int[] array;
public ArrayReview(int length)
{
Random r = new Random(100);
array = new int[length];
for(int i =0 ;i<length;i++)
{
array[i] = r.nextInt();
}
}
@Override
public String toString() {
return “ArrayReview [array=” + Arrays.toString(array) + “]”;
}
public int[] getArray() {
return array;
}

public void setArray(int[] array)
{
this.array = array;
}
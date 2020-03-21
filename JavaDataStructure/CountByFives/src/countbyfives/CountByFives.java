package countbyfives;

public class CountByFives
{
public static void main(String[] args)
{
int val;
final int LIMIT = 200;
for(val = 5; val <= LIMIT; ++val);
{
System.out.println();
}

val = 5;
while(val <= LIMIT)
{
System.out.println(val);
val = val * 5;

}

}
}

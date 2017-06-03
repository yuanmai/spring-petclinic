package org.springframework.samples.petclinic;

/**
 * Created by IntelliJ IDEA.
 * User: jennifer.huang
 * Date: 6/2/2017
 */
public class Test {
    String[] alpha = new String[]{"I", "V","X","L","C","D","M"}; //1,5,10,50,100,500,1000

    public static void main(String[] args) {
        Test test1= new Test();
        System.out.println(test1.test(3));
//        System.out.println(test1.test(5));
//        System.out.println(test1.test(11));
        System.out.println(test1.test(400));
//        System.out.println(test1.test(900));
//        System.out.println(test1.test(901));
//        System.out.println(test1.test(1000));
//        System.out.println(test1.test(1100));
//        System.out.println(test1.test(4000));
        System.out.println(test1.test(4999));
    }

    public String test(int arabic){
        String roman="";
        int bit = 0;
        while (arabic > 0)
        {
            int tempnum = arabic % 10;
//            System.out.println("tempnum:"+tempnum);
//            System.out.println("bit: "+bit);
            if(bit>7){
                break;
            }

            switch (tempnum)
            {
                case 3:
                {
                    roman=this.alpha[bit]+roman;
                    tempnum--;
                }
                case 2:
                {
                    roman=this.alpha[bit]+roman;
                    tempnum--;
                }
                case 1:
                {
                    roman=this.alpha[bit]+roman;
                    break;
                }
                case 4:
                {
                    if(bit>5) break;
                    roman=this.alpha[bit + 1]+roman;
                    roman=this.alpha[bit]+roman;
                    break;
                }
                case 8:
                {
                    roman=this.alpha[bit]+roman;
                    tempnum--;
                }
                case 7:
                {
                    roman=this.alpha[bit]+roman;
                    tempnum--;
                }
                case 6:
                {
                    roman=this.alpha[bit]+roman;
                    tempnum--;
                }
                case 5:
                {
                    if(bit>6) break;
                    roman=this.alpha[bit + 1]+roman;
                    break;
                }
                case 9:
                {
                    if(bit>5)  break;
                    roman=this.alpha[bit + 2]+roman;
                    roman=this.alpha[bit]+roman;
                    break;
                }
                default:
                {
                    break;
                }
            }
            bit += 2;    //十位数进入10[2]，  百位数进入100[4]
            arabic = (int) Math.floor(arabic / 10);
//



        }
        return roman;

    }
}

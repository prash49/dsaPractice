
package interview;


import java.util.Arrays;
import java.util.List;

public class Interview {

    public static void main(String[] args) {
         /*
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
use java stream and find the sum of square of even numbers*/
        List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum =  numbers2.stream().filter(i -> i % 2 == 0)
                .map( num  -> num * num)
                .reduce(0, (num,num2) -> num + num2);

        System.out.println("sum of Even number in list is :"+ sum);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int sumOfSquares = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();
        System.out.println("Sum of squares of even numbers: " + sumOfSquares);

        // TODO write a program to print 0  3  7 12 18 25
        int counter = 0;
        for (int i = 0; i <= 25; ){
            System.out.println(i); //0 ,3 ,7
            i = i + counter + 3 ;  // 3 , 3+3+1 =7, 7 + 1 + 3,
            counter++; //0,1
        }

        /*TODO  Problem Statment
         * write api to read {name:"xxxx",age:21,address:"fff"}  write the db save and return the primary key */

        /*1. Create A Controller Layer
         * 2. Interface
         * 3. Service Layer
         * 4. Repository layer
         *  considering already entity domain exists with above filds name string, age int and address is string
         * and Id generation automatically which i need to return */

        /*
        *    @RestController
                @RequestMapping( "/personDetails")
        public class PersonDetailscontroller{

            private static IPersonDetails personDetails;

            PersonDetailscontroller(IPersonDetails personDetails){
                this.personDetails = personDetails;
            }   @ApiOperations("api to persist Person details");
            @PostMapping(value = "/save", consumes = MediaType.Application/JSON, produces = [MediaType.Application/js])
        }
        */

    }

}



//implementing the interface cell
abstract class matrix implements cell{
    
    matrix(int m,int n){

        //create new worksheet
    }

    //takes worksheet as parameter,new number of rows & old number of columns
   double[][] add_new_rows(double[][] worksheet,int m,int n){
   
   
    return worksheet;
    //returns updated_worksheet

   }

    //takes worksheet as parameter,number of rows & new number of columns
   double[][] add_new_column(double[][] worksheet,int m,int n){
   
   
    return worksheet;
    //returns updated_worksheet

   }

        //takes worksheet as parameter,number of rows & new number of columns
   double[][] delete_a_column(double[][] worksheet,int m,int n){
   
   
    return worksheet;
    //returns updated_worksheet

   }
       //takes worksheet as parameter,number of rows & new number of columns
       double[][] delete_a_row(double[][] worksheet,int m,int n){
   
   
        return worksheet;
        //returns updated_worksheet
    
       }

       //takes expression to be evaluated as parameter
    public double calculator(String exp){

        //perform calculation and return ans
        return 0;
    }
}
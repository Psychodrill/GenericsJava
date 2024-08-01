public class Comparator {

    public static <U,V> boolean compareArrays(U[] firstArr, V[]secondArr){

        boolean result = false;
        if(firstArr.length ==secondArr.length){
            result = true;
            for (int i=0; i<firstArr.length; i++) {

                if(firstArr[i].getClass()!=secondArr[i].getClass()) result=false;
                
            }
        }
        return result;
    }
}

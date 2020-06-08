class Recursion {
    def findLength(mas: Seq[Int],i: Int, length: Int,maxLength: Int):Int = {
        if(i>mas.length-1)
            maxLength
        else
        if(mas(i)==mas(i-1)) {
            if(length+1>maxLength) findLength(mas,i+1,length+1,length+1)
            else findLength(mas,i+1,length+1,maxLength)
        } else findLength(mas,i+1,1,maxLength)
    }
}
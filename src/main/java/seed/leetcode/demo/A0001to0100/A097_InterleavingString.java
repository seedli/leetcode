package seed.leetcode.demo.A0001to0100;


import java.util.LinkedList;

public class A097_InterleavingString {

    //TLE
    public boolean isInterleave(String s1, String s2, String s3) {

        LinkedList<Character> ls1 = toCharList(s1.toCharArray());
        LinkedList<Character> ls2 = toCharList(s2.toCharArray());
        LinkedList<Character> ls3 = toCharList(s3.toCharArray());

        return backtrack(ls1, ls2, ls3);
    }

    private boolean backtrack(LinkedList<Character> ls1, LinkedList<Character> ls2, LinkedList<Character> ls3){

        if(ls3.size() == 0){
            if(ls1.size() == 0 && ls2.size() == 0) return true;
            else return false;
        }
        LinkedList<Character> tmpLs1 = new LinkedList<>(ls1);
        LinkedList<Character> tmpLs2 = new LinkedList<>(ls2);
        LinkedList<Character> tmpLs3 = new LinkedList<>(ls3);
        Character c3 = tmpLs3.poll();

        if(tmpLs1.size() > 0 && tmpLs2.size() > 0){
            if(tmpLs1.peek().equals(c3) && tmpLs2.peek().equals(c3)){
                tmpLs1.poll();
                tmpLs2.poll();
                return backtrack(tmpLs1, ls2, tmpLs3) || backtrack(ls1, tmpLs2, tmpLs3);
            }else if(tmpLs1.peek().equals(c3)){
                tmpLs1.poll();
                return backtrack(tmpLs1, tmpLs2, tmpLs3);
            }else if(tmpLs2.peek().equals(c3)){
                tmpLs2.poll();
                return backtrack(tmpLs1, tmpLs2, tmpLs3);
            }
        }else if(tmpLs1.size() > 0){
            if(tmpLs1.peek().equals(c3)){
                tmpLs1.poll();
                return backtrack(tmpLs1, tmpLs2, tmpLs3);
            }
        }else if(tmpLs2.size() > 0){
            if(tmpLs2.peek().equals(c3)){
                tmpLs2.poll();
                return backtrack(tmpLs1, tmpLs2, tmpLs3);
            }
        }

        return false;

    }

    private LinkedList<Character> toCharList(char[] aryC){
        LinkedList<Character> listC = new LinkedList<>();

        for(Character c : aryC){
            listC.add(c);
        }

        return  listC;
    }

}

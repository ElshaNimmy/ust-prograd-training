class Solution {
    public static String whoLikesIt(String... names) {
        int temp = names.length;
        int tem=temp-2;
        if(temp == 0) return "no one likes this";
        if(temp == 1) return names[0] + " likes this";
        if(temp == 2) return names[0] + " and " + names[1] + " like this";
        if(temp == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        if(temp >= 4) return names[0] + ", " + names[1] + " and " + tem + " others like this";
        return "";
    }
}
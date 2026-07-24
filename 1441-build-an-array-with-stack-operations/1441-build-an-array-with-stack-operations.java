class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<>();
        int index=0;
        for(int curr=1;curr<=n;curr++){
            li.add("Push");
            if(curr==target[index]){
                index++;
                if(index==target.length){
                    break;
                }
            }
            else{
                li.add("Pop");
            }
        }
    return li;
    }
}
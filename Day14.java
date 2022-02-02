class Difference{
    // instance variables
    private int[] elements;
    public int maximumDifference;
    
    public Difference(int[] elements){
        this.elements = elements;
    }

    /** Sorts the array
    *   Saves max abs difference between first and last element to maximumDifference. **/
    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
}

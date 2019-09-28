class obj {
	private int legs, eyes;
	private String colour, name;
	private obj parent;
    private int count=1;
    private hierarchy family;

	obj(String n, int l, int e, String c, obj p) {
		name = n;
		legs = l;
		eyes = e;
		colour = c;
		parent = p;
	}
    //track the colour of parent
    public String trackColour(obj test){
        while((test.getColour()=="null")&&(count<=family.cnt)){
            count++;
            test=test.getParent();
            trackColour(test);
        }
        System.out.println(test.getColour() + " skin colour");
       return test.getColour();
       }



	String getName() { return name; }
	int getLegs() { return legs; }
	int getEyes() { return eyes; }
	String getColour() { return colour; }
	obj getParent() { return parent; }
}

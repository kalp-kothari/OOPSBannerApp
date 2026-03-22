class Hello {
	void main(String args[]) {
		StringBuilder nameBuilder = new StringBuilder();
		String name = " ";
		if (args.length >0) {
		for (int i = 0; i < args.length; i++) {
			nameBuilder.append(args[i]);
			if (i<args.length-1) {
				nameBuilder.append(", ");
			}
			name = nameBuilder.toString();
		}
		}
		else
			name = "World";
		System.out.println("Hello, "+ name + "!");
	}
}
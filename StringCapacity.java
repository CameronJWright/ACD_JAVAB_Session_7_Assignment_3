package session7;

public class StringCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Oh Happy Days";
		System.out.println("String: " + input);
		StringBuilder sb = new StringBuilder();
		System.out.println("StringBuilder: " + sb);

		System.out.println("StringBuilder initial capacity: " + sb.capacity());
		sb.append(input+" ");
		System.out.println("StringBuilder: " + sb);

		System.out.println("StringBuilder capacity after appending: " + sb.capacity());
		sb.append(input+" ");
		sb.append(input+" ");
		System.out.println("StringBuilder: " + sb);

		System.out.println("StringBuilder capacity after appending: " + sb.capacity());

	}

}

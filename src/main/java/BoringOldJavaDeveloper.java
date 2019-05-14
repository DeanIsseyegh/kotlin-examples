import examplesv2.a1refresher.LazyNinjaDeveloperRefresher;

public class BoringOldJavaDeveloper {

	public static void main(String[] args) {
		LazyNinjaDeveloperRefresher lazyNinjaDeveloperRefresher = new LazyNinjaDeveloperRefresher();
		lazyNinjaDeveloperRefresher.imOverloaded("hi");
//		lazyNinjaDeveloperRefresher.imOverloaded("hi", "custom message");
//		lazyNinjaDeveloperRefresher.imOverloaded("hi", "custom message", 999);


		lazyNinjaDeveloperRefresher.getImANullableValue();
		lazyNinjaDeveloperRefresher.setImANullableValue("I can be set, dont be afraid to gimme a pet!");
	}
}

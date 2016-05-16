# robospresso
This is an **experiment** to combine Robolectric with Espresso. Let's look at some Espresso code:

```java
onView(withId(R.id.text)).check(matches(withText("We love Unicorns!")));
```

In Robolectric, the code would look like this:

```java
TextView text = (TextView) activity.findViewById(R.id.text);
assertThat(text.getText().toString()).isEqualTo("We love Unicorns!");
```

Now, the Espresso code is pretty descriptive. Wouldn't it be awesome if you could run the *same* test implementation as both UI test with Espresso as well as a fast unit-test with Robolectric?

Let's find out! :-)

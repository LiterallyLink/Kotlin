fun main(): Unit {
    var string = "BREAKING: House explodes when police approach Arlington, VA home to execute search warrant.";
    string = string.lowercase();

    var uwuString = uwuify(string);

    println(uwuString);
};

fun uwuify(input: String): String {
    return input
        .replace("l", "w")
        .replace("r", "w")
        .replace("u", "uw");
}
package bitManipulation.ShashCode;

public class CharacterConversion {
    public static void main(String[] args) {
        System.out.println(toLowerCase('A'));
        System.out.println(toUpperCase('a'));
        System.out.println(changeCase('A'));
        System.out.println(toLowerCaseSpecial('A'));
        System.out.println(toUpperCaseSpecial('a'));
        System.out.println(changeCaseSpecial('A'));

    }
    public static char toLowerCase(char ch) {
        return (char)(ch | (1<<5));
    }
    public static char toLowerCaseSpecial(char ch) {
        return (char)(ch | ' '); // ASCII value of ' ' (space) is 32
    }

    public static char toUpperCase(char ch) {
        return (char)(ch & ~(1<<5));
    }
    public static char toUpperCaseSpecial(char ch) {
        return (char)(ch & '_'); // ASCII value of '_'(UnderScore) = ~(1<<5)
    }

    public static char changeCase(char ch) {
        return (char)(ch ^ 1<<5);
    }
    public static char changeCaseSpecial(char ch) {
        return (char)(ch ^ ' ');
    }
}

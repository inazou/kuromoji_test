package main;

import java.util.List;

import com.atilika.kuromoji.ipadic.Token;
import com.atilika.kuromoji.ipadic.Tokenizer;

public class Main {

    public static void main(String[] args) {
        String parseWord = "";
        Tokenizer tokenizer = new Tokenizer();
        List<Token> tokensNormal = tokenizer.tokenize(parseWord);

        for (Token token : tokensNormal) {
            System.out.println(token.toString());
        }
    }

}

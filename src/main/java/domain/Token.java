package domain;

public class Token {
    private static final String OPERAND_ERROR_MESSAGE = "올바른 피연산자가 아닙니다.";
    private static final String OPERATOR_ERROR_MESSAGE = "올바른 연산자가 아닙니다.";
    private static final String OPERAND_PATTERN = "[0-9]+";
    private static final String OPERATOR_PATTERN = "[+\\-*/]";
    private final String Token;

    public Token(String token) {
        this.Token = token;
    }

    public void validateOperand() {
        if (isOperator()) {
            throw new IllegalArgumentException(OPERAND_ERROR_MESSAGE);
        }
    }

    public void validateOperator() {
        if (isOperand()) {
            throw new IllegalArgumentException(OPERATOR_ERROR_MESSAGE);
        }
    }

    public boolean isOperand() {
        return Token.matches(OPERAND_PATTERN);
    }

    public boolean isOperator() {
        return Token.matches(OPERATOR_PATTERN);
    }
}

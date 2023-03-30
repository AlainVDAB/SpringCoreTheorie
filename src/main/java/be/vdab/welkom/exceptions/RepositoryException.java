package be.vdab.welkom.exceptions;

public class RepositoryException extends RuntimeException{
    public RepositoryException(Exception cause) {
        super(cause);
    }
}

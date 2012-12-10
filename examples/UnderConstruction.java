package examples;

public @interface UnderConstruction {
        String owner() default "Patrick Naughton";
        String value() default "Object is Under Construction.";
        String createdBy() default "Mike Sheridan";
        String lastChanged() default "08/07/2011";
}

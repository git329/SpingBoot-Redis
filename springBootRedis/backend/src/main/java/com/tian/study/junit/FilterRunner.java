package com.tian.study.junit;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 * @author tiayin
 * @date 2017/8/2
 */
public class FilterRunner extends BlockJUnit4ClassRunner {

//    private Class<?> testedClass;
//    private Boolean ignore;
//    private Runner originalRunner;
//    private List<Method> ignoreMethods = new ArrayList<>();

    public FilterRunner(Class<?> testedClass) throws InitializationError {
        super(testedClass);
//        this.testedClass = testedClass;
//        UsingFilter usingFilter = testedClass.getAnnotation(UsingFilter.class);

//        //Ensure the testcase must have the annotation @UsingFilter
//        if (null == usingFilter) {
//            String message = String.format("The  %s must be marked as @%s.", testedClass, UsingFilter.class);
//            throw new IllegalArgumentException(message);
//        }

        //get all the methods with UsingFilter annotation
//        for (Method method : this.testedClass.getMethods()) {
//            try {
//                if (method.getAnnotation(UsingFilter.class) != null && method.getAnnotation(UsingFilter.class).filter().newInstance().ignore()) {
//                    ignoreMethods.add(method);
//                }
//            } catch (InstantiationException | IllegalAccessException e) {
//                String message = String.format("The class \"%s\" can't be instantiated.", usingFilter.filter().getName());
//                throw new UnsupportedOperationException(message);
//            }
//
//        }

//        //Get the filter, then later can decide if igore.
//        try {
//            Filter filter = usingFilter.filter().newInstance();
//            this.ignore = filter.ignore();
//        } catch (InstantiationException | IllegalAccessException e) {
//            String message = String.format("The class \"%s\" can't be instantiated.", usingFilter.filter().getName());
//            throw new UnsupportedOperationException(message);
//        }


        //Create the original runner instance
//        Constructor<? extends Runner> originalRunnerConstuctor;
//        try {
//            originalRunnerConstuctor = usingFilter.originalRunner().getConstructor(Class.class);
//        } catch (NoSuchMethodException e) {
//            String message = String.format("The class %s must has a public constructor with one Class Type paremeter.", usingFilter.originalRunner());
//            throw new UnsupportedOperationException(message);
//        }
//        try {
//            this.originalRunner = (Runner) originalRunnerConstuctor.newInstance(testedClass);
//        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            String message = String.format("Cannot create instance for %s, with the message:%s.", usingFilter.originalRunner(), e.getMessage());
//            throw new UnsupportedOperationException(message, e);
//        }


    }



    @Override
    protected boolean isIgnored(FrameworkMethod child) {
        try {
            if ((child.getAnnotation(UsingFilter.class) != null && child.getAnnotation(UsingFilter.class).filter().newInstance().ignore()))
                return true;
            else return false;
        } catch (InstantiationException|IllegalAccessException e) {
            throw new UnsupportedOperationException(e);
        }
    }






    }

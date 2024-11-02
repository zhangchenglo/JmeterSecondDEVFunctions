package org.apache.jmeter.functions;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.Collection;
import java.util.List;
import java.util.Random;

public class RandomSex extends AbstractFunction{

    private static final String Key = "__RandomSex";


    @Override
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        String[] array = {"男", "女"};
        Random random = new Random();
        int nextInt = random.nextInt(array.length);
        return array[nextInt];
    }

    @Override
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {

    }

    @Override
    public String getReferenceKey() {
        return Key;
    }

    @Override
    public List<String> getArgumentDesc() {
        return null;
    }
}

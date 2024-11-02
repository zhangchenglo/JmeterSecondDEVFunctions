package org.apache.jmeter.functions;

import com.github.javafaker.Faker;
import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.Collection;
import java.util.List;

public class RandomJobField extends AbstractFunction{

    private static final String KEY_ = "__RandomJobField";

    Faker faker = new Faker();

    @Override
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        return faker.job().field();
    }

    @Override
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {

    }

    @Override
    public String getReferenceKey() {
        return KEY_;
    }

    @Override
    public List<String> getArgumentDesc() {
        return null;
    }
}

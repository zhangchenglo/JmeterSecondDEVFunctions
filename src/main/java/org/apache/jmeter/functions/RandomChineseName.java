package org.apache.jmeter.functions;

import com.github.javafaker.Faker;
import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class RandomChineseName extends AbstractFunction{

    private static final String key = "__RandomChineseName";

    Faker faker = new Faker(Locale.CHINA);

    @Override
    public String execute(SampleResult sampleResult, Sampler sampler) throws InvalidVariableException {
        return faker.name().fullName();
    }

    @Override
    public void setParameters(Collection<CompoundVariable> collection) throws InvalidVariableException {

    }

    @Override
    public String getReferenceKey() {
        return key;
    }

    @Override
    public List<String> getArgumentDesc() {
        return null;
    }
}

package com.chathuranga.apache.cxf.jax.ws.samples.impl;

import com.chathuranga.apache.cxf.jax.ws.samples.CalculatorService;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <p>
 *     SIB for {@link com.chathuranga.apache.cxf.jax.ws.samples.CalculatorService}
 * </p>
 * @author Chathuranga Tennakoon / www.chathurangaonline.com
 */
@WebService
public class CalculatorServiceImpl implements CalculatorService {

    @WebMethod
    public double addNumbers(double num1, double num2) {
        return num1 + num2;
    }
}

package com.chathuranga.apache.cxf.jax.ws.samples;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <p>
 *     SEI
 * </p>
 * @author Chathuranga Tennakoon / www.chathurangaonline.com
 */
@WebService
public interface CalculatorService {

    @WebMethod
    double addNumbers(double num1,double num2);
}

package org.javaguru.travel.insurance.core;

import org.assertj.core.api.Assertions;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

    @Test
    public void should_populate_person_first_name() {
        var travel = new TravelCalculatePremiumServiceImpl();
        var request = new TravelCalculatePremiumRequest("John", "Doe", new Date(1), new Date(1));
        var expected = new TravelCalculatePremiumResponse( "John", "Doe", new Date(1), new Date(1));
        
        var calculatePremiumResponse = travel.calculatePremium(request);

        Assertions.assertThat(calculatePremiumResponse.getPersonFirstName()).isEqualTo(expected.getPersonFirstName());
    }

    @Test
    public void should_populate_person_last_name() {
        var travel = new TravelCalculatePremiumServiceImpl();
        var request = new TravelCalculatePremiumRequest("John", "Doe", new Date(1), new Date(1));
        var expected = new TravelCalculatePremiumResponse("John", "Doe", new Date(1), new Date(1));

        var calculatePremiumResponse = travel.calculatePremium(request);

        Assertions.assertThat(calculatePremiumResponse.getPersonLastName()).isEqualTo(expected.getPersonLastName());
    }

    @Test
    public void should_populate_agreement_date_from() {
        var travel = new TravelCalculatePremiumServiceImpl();
        var request = new TravelCalculatePremiumRequest("John", "Doe", new Date(1), new Date(1));
        var expected = new TravelCalculatePremiumResponse("John", "Doe", new Date(1), new Date(1));

        var calculatePremiumResponse = travel.calculatePremium(request);

        Assertions.assertThat(calculatePremiumResponse.getAgreementDateFrom()).isEqualTo(expected.getAgreementDateFrom());
    }

    @Test
    public void should_populate_agreement_date_to() {
        var travel = new TravelCalculatePremiumServiceImpl();
        var request = new TravelCalculatePremiumRequest("John", "Doe", new Date(1), new Date(1));
        var expected = new TravelCalculatePremiumResponse("John", "Doe", new Date(1), new Date(1));

        var calculatePremiumResponse = travel.calculatePremium(request);

        Assertions.assertThat(calculatePremiumResponse.getAgreementDateTo()).isEqualTo(expected.getAgreementDateTo());
    }
}
public class TravelBooking {
    private Flight flight;
    private Hotel hotel;
    private Car car;

    public TravelBooking(){
        flight = new Flight();
        hotel = new Hotel();
        car = new Car();
    }

    public void bookTravel() {
        flight.bookFlight();
        hotel.reserveHotel();
        car.rentCar();
    }
}

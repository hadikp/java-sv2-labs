package statemachine.seatheater;

public enum SeatHeaterState {

    OFF {
        @Override
        SeatHeaterState next() {
            return THIRD;
        }
    },
    THIRD {
        @Override
        SeatHeaterState next() {
            return SECOND;
        }
    },
    SECOND {
        @Override
        SeatHeaterState next() {
            return FIRST;
        }
    },
    FIRST {
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    };

    abstract SeatHeaterState next();
}

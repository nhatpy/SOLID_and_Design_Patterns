package Solid_Principle.Interface_Segregation_Principle;

public class After {
    interface IEncoder {
        void encode(String data);

    }

    interface IDecoder {

        void decode(String data);
    }

    class Encoder implements IEncoder {
        @Override
        public void encode(String data) {
            // Encoding logic
        }

    }

    class Decoder implements IDecoder {

        @Override
        public void decode(String data) {
            // Decoding logic
        }
    }
}

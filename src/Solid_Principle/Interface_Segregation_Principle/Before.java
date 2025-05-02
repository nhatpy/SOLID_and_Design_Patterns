package Solid_Principle.Interface_Segregation_Principle;

public class Before {
    interface EncoderDecoder {
        void encode(String data);

        void decode(String data);
    }

    class Encoder implements EncoderDecoder {
        @Override
        public void encode(String data) {
            // Encoding logic
        }

        @Override
        public void decode(String data) {
            // Decoding logic (not needed for Encoder)
        }
    }

    class Decoder implements EncoderDecoder {
        @Override
        public void encode(String data) {
            // Encoding logic (not needed for Decoder)
        }

        @Override
        public void decode(String data) {
            // Decoding logic
        }
    }
}

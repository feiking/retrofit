// Generated by the protocol buffer compiler.  DO NOT EDIT!

package retrofit.converter;

public interface PhoneProtos {
  @SuppressWarnings("hiding")
  public static final class Phone extends
      com.google.protobuf.nano.MessageNano {
    public static final Phone EMPTY_ARRAY[] = {};
    public Phone() {}

    // optional string number = 1;
    public java.lang.String number = "";

    public final Phone clear() {
      number = "";
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
                        throws java.io.IOException {
      if (!this.number.equals("")) {
        output.writeString(1, this.number);
      }
    }

    @Override
    public int getSerializedSize() {
      int size = 0;
      if (!this.number.equals("")) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeStringSize(1, this.number);
      }
      cachedSize = size;
      return size;
    }

    @Override
    public Phone mergeFrom(
        com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            this.number = input.readString();
            break;
          }
        }
      }
    }

    public static Phone parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Phone(), data);
    }

    public static Phone parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Phone().mergeFrom(input);
    }

  }

}

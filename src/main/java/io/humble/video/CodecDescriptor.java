/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * Meta-data that describes a {@link Codec} object.  
 */
public class CodecDescriptor extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected CodecDescriptor(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGCodecDescriptorUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected CodecDescriptor(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGCodecDescriptorUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(CodecDescriptor obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new CodecDescriptor object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public CodecDescriptor copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new CodecDescriptor(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof CodecDescriptor)
      equal = (((CodecDescriptor)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  
/**
 * Checks if this codec has the given property.  
 * @param	p property to check  
 */
  public boolean hasProperty(CodecDescriptor.CodecProperty p) {
    return VideoJNI.CodecDescriptor_hasProperty(swigCPtr, this, p.swigValue());
  }

/**
 * Name of the codec. Unique for each codec. Will contain only  
 * alphanumeric and _ characters.  
 */
  public String getName() {
    return VideoJNI.CodecDescriptor_getName(swigCPtr, this);
  }

/**
 * A more descriptive name for this codec.  
 */
  public String getLongName() {
    return VideoJNI.CodecDescriptor_getLongName(swigCPtr, this);
  }

/**
 * A bit mask of {@link Codec.Properties} this codec has.  
 */
  public int getProperties() {
    return VideoJNI.CodecDescriptor_getProperties(swigCPtr, this);
  }

/**
 * Get the codec ID for this descriptor  
 */
  public Codec.Id getId() {
    return Codec.Id.swigToEnum(VideoJNI.CodecDescriptor_getId(swigCPtr, this));
  }

  public MediaDescriptor.Type getType() {
    return MediaDescriptor.Type.swigToEnum(VideoJNI.CodecDescriptor_getType(swigCPtr, this));
  }

/**
 * Get the descriptor for the given id.  
 */
  public static CodecDescriptor make(Codec.Id id) {
    long cPtr = VideoJNI.CodecDescriptor_make(id.swigValue());
    return (cPtr == 0) ? null : new CodecDescriptor(cPtr, false);
  }

  public enum CodecProperty {
  /**
   * Properties supported by a codec.
   * Codec uses only intra compression.
   * Video codecs only.
   */
    PROP_INTRA_ONLY(VideoJNI.CodecDescriptor_PROP_INTRA_ONLY_get()),
  /**
   * Codec supports lossy compression. Audio and video codecs only.
   * 
   * compression modes
   */
    PROP_LOSSY(VideoJNI.CodecDescriptor_PROP_LOSSY_get()),
  /**
   * Codec supports lossless compression. Audio and video codecs only. 
   *
   */
    PROP_LOSSLESS(VideoJNI.CodecDescriptor_PROP_LOSSLESS_get()),
  /**
   * Subtitle codec is bitmap based
   */
    PROP_BITMAP_SUB(VideoJNI.CodecDescriptor_PROP_BITMAP_SUB_get());

    public final int swigValue() {
      return swigValue;
    }

    public static CodecProperty swigToEnum(int swigValue) {
      CodecProperty[] swigValues = CodecProperty.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (CodecProperty swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + CodecProperty.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private CodecProperty() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private CodecProperty(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private CodecProperty(CodecProperty swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}

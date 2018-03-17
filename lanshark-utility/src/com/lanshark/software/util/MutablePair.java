package com.lanshark.software.util;

/**
 * Represents a mutable pair of Objects.
 * Instances of this class are not reliable for Maps or Hashtables because the "Key" is mutable!
 * 
 * @author Jonathan Ritter
 * 
 * @param <K>   The Key in the pair.
 * @param <V>   The Value in the pair.
 */
public class MutablePair<K, V>
{

    /**
     * The Key in the pair.
     */
    protected K key;

    /**
     * The Value in the pair.
     */
    protected V value;

    /**
     * Creates a MutablePair Object with the given Key and Value.
     *
     * @param key       The Key in the pair.
     * @param value     The Value in the pair.
     */
    public MutablePair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    /**
     * Assigns the given Object as the Key in the pair.
     * @param key
     */
    public void setKey(K key)
    {
        this.key = key;
    }

    /**
     * Assigns the given Object as the Value in the pair.
     * @param value
     */
    public void setValue(V value)
    {
        this.value = value;
    }

    /**
     * Returns the Key in the pair.
     *
     * @return  The Key value.
     */
    public K getKey()
    {
        return this.key;
    }

    /**
     * Returns the Value in the pair.
     *
     * @return  The Value value.
     */
    public V getValue()
    {
        return this.value;
    }

    /**
     * Determines whether another Object is equivalent to the MutablePair.
     *
     * @param obj   The Object to compare with.
     * @return      Ture if the second Object is a MutablePair with a matching Key.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        try
        {
            if (((MutablePair) obj).key == null)
                return this.key == null;

            return this.key == ((MutablePair) obj).key;
        }
        catch (Exception ex)
        {
            return false;
        }
    }

    /**
     * Returns the Key and Value separated by a comma.
     *
     * @return  The String representation of the MutablePair
     */
    @Override
    public String toString()
    {
        return this.key + ", " + this.value;
    }
}

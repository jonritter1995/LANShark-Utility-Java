package com.lanshark.software.util;

/**
 * Represents a Pair of Objects where one Object is a Key to identify the pair and the other
 * Object is a Value.
 * Both values are immutable.
 *
 * @author Jonathan Ritter
 *
 * @param <K>   The Key in the pair.
 * @param <V>   The Value in the pair.
 */
public class KeyValuePair<K, V>
{

    /**
     * The Key portion of the KeyValuePair.
     */
    protected final K key;

    /**
     * The Value portion of the KeyValuePair.
     */
    protected final V value;

    /**
     * Creates a KeyValuePair object with the given Key and Value.
     *
     * @param key       The Key in the pair.
     * @param value     The Value in the pair.
     */
    public KeyValuePair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    /**
     * Returns the Key in the KeyValuePair.
     *
     * @return  The Key.
     */
    public K getKey()
    {
        return this.key;
    }

    /**
     * Returns the Value in the KeyValuePair.
     *
     * @return  The Value.
     */
    public V getValue()
    {
        return this.value;
    }

    /**
     * Determines whether another Object is equivalent to the KeyValuePair.
     *
     * @param obj   The Object to compare with.
     * @return      Ture if the two Object is a KeyValuePair with a matching Key.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        try
        {
            if (((KeyValuePair) obj).key == null)
                return this.key == null;

            return this.key == ((KeyValuePair) obj).key;
        }
        catch (Exception ex)
        {
            return false;
        }
    }

    /**
     * Returns the Key followed by a colon and then the Value.
     *
     * @return  The String representation of the KeyValuePair
     */
    @Override
    public String toString()
    {
        return this.key + ": " + this.value;
    }
}

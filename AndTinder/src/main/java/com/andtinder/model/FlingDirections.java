/**
 * AndTinder v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 *
 * TAndTinder is a native library for Android that provide a
 * Tinder card like effect. A card can be constructed using an
 * image and displayed with animation effects, dismiss-to-like
 * and dismiss-to-unlike, and use different sorting mechanisms.
 *
 * AndTinder is compatible with API Level 13 and upwards
 *
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.andtinder.model;

public class FlingDirections {
	 public enum FlingDirection {
	        Horizontal, Vertical;

	        public static FlingDirection fromIndex(int index) {
		        FlingDirection[] values = FlingDirection.values();
		        if(index < 0 || index >= values.length) {
			        throw new IndexOutOfBoundsException();
		        }
		        return values[index];
	        }
	    }
}

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

package com.andtinder.demo;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.andtinder.model.CardModel;
import com.andtinder.model.FlingDirections;
import com.andtinder.view.CardContainer;
import com.andtinder.view.SimpleCardStackAdapter;

public class MainActivity extends Activity {

	/**
	 * This variable is the container that will host our cards
	 */
	private CardContainer mCardContainer;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainlayout);

		mCardContainer = (CardContainer) findViewById(R.id.layoutview);

		Resources r = getResources();

		SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(this);

		adapter.add(
				new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title2", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title3", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title4", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title5", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title6", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title2", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title3", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title4", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title5", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title6", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title2", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title3", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title4", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title5", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title6", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title2", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title3", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title4", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title5", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title6", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title2", "Description goes here", r.getDrawable(R.drawable.picture2)));
		adapter.add(
				new CardModel("Title3", "Description goes here", r.getDrawable(R.drawable.picture3)));
		adapter.add(
				new CardModel("Title4", "Description goes here", r.getDrawable(R.drawable.picture1)));
		adapter.add(
				new CardModel("Title5", "Description goes here", r.getDrawable(R.drawable.picture2)));

		CardModel cardModel =
				new CardModel("Title1", "Description goes here", r.getDrawable(R.drawable.picture1));
		cardModel.setOnClickListener(new CardModel.OnClickListener() {
			@Override
			public void OnClickListener() {
				Log.i("Swipeable Cards", "I am pressing the card");
			}
		});

		cardModel.setOnCardDimissedListener(new CardModel.OnCardDimissedListener() {
			@Override
			public void onLike() {
				Log.i("Swipeable Cards", "I like the card");
			}

			@Override
			public void onDislike() {
				Log.i("Swipeable Cards", "I dislike the card");
			}
		});

		adapter.add(cardModel);

		mCardContainer.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_change_fling_orientation) {
			if (mCardContainer.getFlingDirection() == FlingDirections.FlingDirection.Horizontal) {
				mCardContainer.setFlingDirection(FlingDirections.FlingDirection.Vertical);
				item.setTitle(R.string.action_horizontal);
			} else {
				mCardContainer.setFlingDirection(FlingDirections.FlingDirection.Horizontal);
				item.setTitle(R.string.action_vertical);
			}

			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

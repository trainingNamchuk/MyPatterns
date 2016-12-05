package abstract_factory;
/**
 * This class represents an "abstract factory" of mobile tariffs and mobile operators
 * 
 * @author Svitlana Namchuk 16.11.16
 * @version 2 16.11.16
 */
public abstract class AbstractFactory {
abstract MobileOperator getMobileOperator(String operator);
abstract Tarrif getMobileTarrif(String tarrif);
}
